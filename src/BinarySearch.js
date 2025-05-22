let arr1 = [1, 2, 3, 4, 5, 6];

function binarySeach(sortedArr, item){
    let start = 0;
    let end = sortedArr.length - 1;
    let middle;

    while(start < end){
        middle = Math.floor((start + end)/2);

        if(sortedArr[middle] == item){
            return middle;
        }

        if(sortedArr[middle] < item){
            start = middle + 1;
        } else {
            end = middle - 1;
        }
    } 
    return null;
}

console.log(binarySeach(arr1, 3));