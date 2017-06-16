
function login(){
        var user = document.loginform.user_name.value;
        var pass = document.loginform.pass_word.value;
  if(user == "" || pass == ""){
          alert("Sorry...Please Enter Username and Passowrd");
     }else{
  if((user == "admin" || user == "ADMIN") && pass == "admin123"){
          document.loginform.submit();
         
    }else{
         alert("Please Enter Correct Credentials");
  }
       }
           }



