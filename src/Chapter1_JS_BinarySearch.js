let arr1 = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 70]
let item = 11
let count = 0;

function binarySeach(sortedArr, item){
    let start = 0;
    let end = sortedArr.length - 1;
    let middle;

    while(start <= end){
        count++
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

console.log(`Индекс элемента ${item} равен ` + binarySeach(arr1, item))
console.log(count)