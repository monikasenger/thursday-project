//javascript file for calculator

//for display button
function display(val){

    document.getElementById('calc').value += val
    
    return val
    
    }
    //for solve button
    function solve(){
    
    let x = document.getElementById('calc').value
    
    let y = eval(x);
    
    document.getElementById('calc').value = y
    
    return y
    
    }
    //for click button
    function clearScreen(){
    
    document.getElementById('calc').value = ''
    
    }
    //for back button
    function back() {
      if(value.length>0)
        document.getElementById('calc').value=value.substr(0, value.length - 1);
    }
