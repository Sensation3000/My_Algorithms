
function selectionSort(arr){
  
for (let i = 0; i < arr.length-1; i++){
    let indMin = i;
 for (let j = i + 1; j < arr.length; j++) {
  if(arr[j] < arr[indMin]){
    indMin = j;
    }
  }
    const temporary = arr[i];
    arr[i] = arr[indMin];
    arr[indMin] = temporary;
}
 return arr;
}

const arr = [4, 1, 5, 82, 35, 2, 75];
console.log(selectionSort(arr));
