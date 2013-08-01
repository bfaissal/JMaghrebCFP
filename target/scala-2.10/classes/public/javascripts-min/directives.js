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
                scope.inProgress = false;
                $("#" + attrs.id).fileupload({
                    acceptFileTypes: '/(\.|\/)(gif|jpe?g|png)$/i',
                    maxFileSize: 1000000, // 1 MB
                    dataType: 'json',
                    url: attrs.url,

                    done: function (e, data) {
                        $.each(data.result.files, function (index, file) {
                            try{

                            scope.$apply(function () {
                                //scope.inProgress = false;
                                scope.image = file.name;
                            })
                            }catch(e){

                            }
                        });
                    }
                }).on('fileuploadadd', function (e, data) {
                        scope.isEdit = false;
                        scope.inProgress = true;
                        $('#progress .progress-bar').css(
                            'width','0%');
                        $.each(data.files, function (index, file) {

                        });
                    }).on('fileuploadfail', function (e, data) {
                        alert( " "+data.jqXHR.responseText);
                    }).on('fileuploadprogressall', function (e, data) {
                        var progress = parseInt(data.loaded / data.total * 100, 10);

                        $('#progress .progress-bar').css(
                            'width',
                            progress + '%'
                        );
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
                '</span>       ' +
                '<div id="progress" class="progress" ng-show="(image == null || image ==\'\')">' +
                '<div class="progress-bar" style="width: 0%"></div>' +
                '</div>'+
                '<div id="{{id}}Holder" ng-show="image != null && image !=\'\'" style="display: none"> ' +
                '<div><img style="width: 150px;" ng-show="isEdit" src=\'/images/{{ image }}\'/>' +
                '<img style="width: 150px;" ng-show="!isEdit" src=\'/tmpImages/{{ image }}\'/></div>' +
                '<button class="btn btn-danger" ng-click="canceUpload()">Delete</button>  ' +
                '</div>' +
                '</div>'

        }
    })