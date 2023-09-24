// let a = document.getElementById("video").controls=false;
document.getElementById("submit").onclick = function(){
    if($('#phn').val()!='' && $('#name').val()!=' ' && $('#email').val()!=''  && $('#dob').val()!=''){
        window.location.href="success.html";
        
      } else{
        alert("You have not entered required information");
      }

}
