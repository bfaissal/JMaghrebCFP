/**
 * Created with IntelliJ IDEA.
 * User: faissalboutaounte
 * Date: 13-07-02
 * Time: 21:23
 * To change this template use File | Settings | File Templates.
 */
angular.module('JMAGHREB', ['ngResource'])
    .directive('uploader', function ($http) {
        return {
            restrict: 'E',
            replace: true,
            transclude: false,
            scope: {id: '=',
                image: '=',
                url: "="},
            link: function (scope, element, attrs) {
                //attrs.id = attr.id
                try{
                scope.$apply(function () {
                    scope.image = attrs.image;
                })
                }catch(e){

                }

                scope.url = attrs.url;
                scope.id = attrs.id;
                scope.isEdit = true;
                //alert("Salam = "+scope.$parent.$eval(attrs.image));
                $("#" + attrs.id).fileupload({
                    dataType: 'json',
                    url: attrs.url,
                    //autoUpload: false,
                    acceptFileTypes: /(\.|\/)(gif|jpe?g|png)$/i,
                    maxFileSize: 1000000, // 1 MB
                    done: function (e, data) {
                        $.each(data.result.files, function (index, file) {
                            scope.$apply(function () {
                                scope.image = file.name;
                            })
                        });
                    }
                }).on('fileuploadadd', function (e, data) {
                        scope.isEdit = false;
                        $.each(data.files, function (index, file) {

                        });
                    }).on('fileuploadfail', function (e, data) {
                        alert( " "+data.jqXHR.responseText);
                        /*for( k in data.response()){
                            alert(k)
                        }
                        for( k in data){
                            alert(":: " +k)
                        } */
                    });
                scope.canceUpload = function () {
                    $http({method: 'GET', url: '/deleteImage/'+scope.image+'/'+scope.isEdit}).
                        success(function(data, status, headers, config) {}).
                        error(function(data, status, headers, config) {});
                    scope.image = "";

                }
            },
            template: '<div><span id="{{ id }}Btn" ng-show="image == null || image ==\'\'" class="btn btn-success fileinput-button">' +
                '<i class="icon-plus icon-white"></i>    ' +
                '<span>Select file ...</span>' +
                '<!-- The file input field used as target for the file upload widget -->   ' +
                '<input id="{{id}}" type="file" class="input-xxlarge" name="file"/> ' +
                '</span>         ' +
                '<div id="{{id}}Holder" ng-show="image != null && image !=\'\'" style="display: none"> ' +
                '<div><img style="width: 150px;" ng-show="isEdit" src=\'/images/{{ image }}\'/>' +
                '<img style="width: 150px;" ng-show="!isEdit" src=\'/tmpImages/{{ image }}\'/></div>' +
                '<button class="btn btn-danger" ng-click="canceUpload()">Delete</button>  ' +
                '</div>' +
                '</div>'

        }
    })