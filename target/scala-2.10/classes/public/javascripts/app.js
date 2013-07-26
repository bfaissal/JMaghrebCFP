angular.module('JMAGHREB', ['ngResource'])
function loginController($scope,$resource){
    var Login = $resource("login",
        {} ,
        {
            logIn: {method: 'POST'},
            reset: {method: 'PUT'}
        });
    $scope.login = new Login();
    $scope.doLogin = function(){
        $scope.login.$logIn(function(){
                window.location.href="/go"
            },
            function(){
                $scope.message = {msg : "Username or password incorrect",type:'alert-error'}
            })
    }
    $scope.resetPassword = function(){

        $scope.login.$reset(function(){
            $scope.resetPasswordForm.$setPristine();
            $scope.message = {msg : "Instructions to reset password have been sent to your email Address",type:'alert-success'}
        });
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
        delete $scope.speaker['cpassword'];
        $scope.speaker.$save(function(u){
            $scope.message = {msg : "Account Created",type:'alert-success'}
            $scope.registration.$setPristine();
        },function(u){
            $scope.message = {msg : u.data.message,type:'alert-error'}
        });
    }


}


function talksController($scope,$resource,$location){
    var Login = $resource("/speaker",
        {} ,
        {
            logIn: {method: 'GET'},
            save: {method: 'POST'}
        });
    $scope.login = new Login();
    $scope.login.$logIn();
    $scope.cancelAddTalk = function(){
        $scope.login.$logIn(function(){
            $scope.edition = false;
            $scope.showFormVal = false;
            $scope.submissionForm.$setPristine();
        });
    }
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
    $scope.cancelEditAccounte = function(){
        $scope.login.$logIn();
        $scope.registration.$setPristine();
    }
    $scope.editAccounte = function (){

        $scope.login.$save(function(u){
            $scope.message = {msg : "Account edited",type:'alert-success'}
            $scope.registration.$setPristine();
        },function(u){
            $scope.message = {msg : u.data.message,type:'alert-error'}
        });
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
    $scope.chnagePassword = function (){

        $scope.login.$save(function(u){
            $scope.message = {msg : "Account edited",type:'alert-success'}
            $scope.registration.$setPristine();
            window.location.href = "/logout";

        },function(u){
            $scope.message = {msg : u.data.message,type:'alert-error'}
        });
    }
}