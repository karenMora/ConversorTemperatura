/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var RestControllerModule=(function(){
    var getInfo=function(accion,select,callback){
        axios.get('/info+'+accion+"/").then(function(info){
            callback.onSucces(info.data);
            console.log(info);
            })
            .catch(function(error){
                callback.onFailed(error);
                console.log(error);
            });
    };
    return {
      getInfo: getInfo  
    };
})

