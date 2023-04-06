//use this to hide soft input from an activity
//let btnSignUp is a button 
//on pressing btnSignUp keyboard should hide 
//here is the code 

(getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager).hideSoftInputFromWindow(btnSignUp.windowToken,0)
