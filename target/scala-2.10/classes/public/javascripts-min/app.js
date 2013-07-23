angular.module('JMAGHREB', ['ngResource'])
function loginController($scope,$resource){
    var Login = $resource("login",
        {} ,
        {
            logIn: {method: 'POST'}
        });
    $scope.login = new Login();
    $scope.doLogin = function(){
        $scope.login.$logIn(function(){
            //alert(putResponseHeaders);
            if($scope.login.fname != null ){
                window.location.href="/go"
            }
            else{
                $scope.message = {msg : "Username or password incorrect",type:'alert-error'}
            }
        },
            function(){
                $scope.message = {msg : "Username or password incorrect",type:'alert-error'}
            })
    }
}

function registerController($scope,$resource){
    var Speaker = $resource("speaker",
        {} ,
        {
            save: {method: 'PUT'}
        });
    $scope.speaker = new Speaker();
    $scope.createAccounte = function (){
        $scope.speaker.$save(function(u){
            $scope.message = {msg : "Account Created",type:'alert-success'}
        },function(u){
            $scope.message = {msg : u.data.message,type:'alert-error'}
        });
    }
}

function talksController($scope,$resource){
    var Login = $resource("speaker",
        {} ,
        {
            logIn: {method: 'GET'},
            save: {method: 'POST'}
        });
    $scope.login = new Login();
    $scope.login.$logIn(function(){

    });

    $scope.addTalk = function(){
        if($scope.login.talks == undefined){
            $scope.login.talks = [];
        }
        $scope.selected.status = 1;
        if(!$scope.edition)
            $scope.login.talks.push($scope.selected);
        $scope.login.$save();
        $scope.selected = {};
        $scope.edition = false;
        $scope.showFormVal = false;
        $scope.submissionForm.$setPristine();
    }
    $scope.editaTrack = function(aTrack){
        $scope.selected = aTrack;
        $scope.edition = true;
    }
    $scope.submitTrack = function(aTrack){
        aTrack.status = 2;
        $scope.login.$save();
    }
    $scope.showForm = function(){
        $scope.showFormVal = true;
    }
}