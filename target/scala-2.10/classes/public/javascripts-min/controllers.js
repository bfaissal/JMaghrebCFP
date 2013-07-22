angular.module('myApp.controllers', ['myApp.services'])
function loginController($scope,$resource){
    var Login = $resource("login",
        {} ,
        {
            logIn: {method: 'POST'}
        });
    $scope.login = new Login();
    $scope.doLogin = function(){
        $scope.login.$logIn()
    }
}

function registerController($scope,$resource){
    var Speaker = $resource("speaker",
        {} ,
        {
            save: {method: 'POST'}
        });
    $scope.speaker = new Speaker();
    $scope.createAccounte = function (){
        $scope.speaker.$save();
    }
}