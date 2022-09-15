//hide show method in different button according to the use
    //this is for merge the araay
    function merge() {
        var x = document.getElementById('merge');
        if (x.style.display == 'none') {
            x.style.display = 'block';
        } else {
            x.style.display = 'none';
        }
    }
    function savedata() {
        var x = document.getElementById('display');
        if (x.style.display == 'none') {
            x.style.display = 'block';
        } else {
            x.style.display = 'none';
        }
    }
    function savedata1() {
        var x = document.getElementById('display1');
        if (x.style.display == 'none') {
            x.style.display = 'block';
        } else {
            x.style.display = 'none';
        }
    }     
    // this is for add the array
    function addarray(){
        var x = document.getElementById('addarray');
        if (x.style.display == 'none') {
            x.style.display = 'block';
        } else {
            x.style.display = 'none';
        }
    } function adda() {
        var x = document.getElementById('displaya');
        if (x.style.display == 'none') {
            x.style.display = 'block';
        } else {
            x.style.display = 'none';
        }
    }
    // this is for check the array
    function checkarray(){
        var x = document.getElementById('checkarray');
        if (x.style.display == 'none') {
            x.style.display = 'block';
        } else {
            x.style.display = 'none';
        }
    }
     function addc() {
        var x = document.getElementById('displayc');
        if (x.style.display == 'none') {
            x.style.display = 'block';
        } else {
            x.style.display = 'none';
        }
    }
    
        // this script is used some function doing calculation
        //add the element in merge button
        var data = new Array(); 
         var data1 = new Array();
    // add the element in the array list
        function add(){// first array list
        data.push(document.getElementById('a1').value); 
        document.getElementById('a1').value='';
        var str='';
        var no=document.getElementById('no').value;
        for (i=0;i<no;i++) 
        { 
        str+= +data[i] + ", ";  
        } 
        document.getElementById('displaya1').innerHTML='<b>first array element: </b>{'+str+ '}'; 
        }
        function add1(){// second array list
        data1.push(document.getElementById('a2').value); 
        document.getElementById('a2').value='';
        var str1='';
        var no1=document.getElementById('no1').value;
        for (i=0;i<no1;i++) 
        { 
        str1+= +data1[i] + ", ";  
        } 
        document.getElementById('displaya2').innerHTML='<b>second array element: </b>{'+str1+ '}'; 
        }
        //merge button function to merge the array element
        function mergedata(str,str1){
            var datamer = new Array(); 
            let array1 = data;
    let array2 =data1;
    let array3 = [];
    for(let i=0;i<array1.length;i++){
      if(array3.indexOf(array1[i]) == -1)
         array3.push(array1[i])
    }
    for(let i=0;i<array2.length;i++){
      if(array3.indexOf(array2[i]) == -1)
         array3.push(array2[i])
    }
    document.getElementById('displaymerge').innerHTML='<h2>array element after merge: </h2>{'+array3+ '}'; 
        }
    
        //add the array function
        var dataarray = new Array(); 
          var datael = new Array(); 
    //add the element in array
        function addarr(){
        dataarray.push(document.getElementById('arr').value); 
        document.getElementById('arr').value='';
        var stra='';
        var noa=document.getElementById('noa').value;
        for (i=0;i<noa;i++) 
        { 
        stra+= +dataarray[i] + ", ";  
        } 
        document.getElementById('displayarr1').innerHTML='<b> array element: </b>{'+stra+ '}'; 
        }
    // element do you want to add in the array list
        function adde(){
        datael.push(document.getElementById('e').value); 
       var stre='';
       stre= dataarray + ", "+datael;  
        document.getElementById('displayele').innerHTML='<b> after adding new elements in array : </b>{'+stre+ '}'; 
        }
    
        // check the element containing 
        var checkc = new Array(); 
        // add the element in array
        function checkarr(){
            checkc.push(document.getElementById('arrc').value); 
        document.getElementById('arrc').value='';
        var strc='';
        var noc=document.getElementById('noc').value;
        for (i=0;i<noc;i++) 
        { 
        strc+= +checkc[i] + ", ";  
        } 
        document.getElementById('displaych').innerHTML='<b> array element: </b>{'+strc+ '}'; 
        }
        // check that  the lement present in array or not
        function ce(){
           var arrc=checkc;
            var elem=(document.getElementById('c').value);
            if(arrc.includes(elem)) {
                document.getElementById('displayc1').innerHTML=('<h3>Array contains a value.</h3>');
    } else {
        document.getElementById('displayc1').innerHTML=('<h3>Array does not contain a value.</h3>');
    }
         
    }