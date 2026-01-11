const array = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 70]
let count = 0

// function linearSearch(arr, item){

//     for(let i = 0; i <= arr.length-1; i++){
//         count++
//      if(item == arr[i]){
//         return i
//      }
//     }
//    return null
// }

function binarySearch(arr, item){
    let start = 0
    let end = arr.length-1
    let position = -1
    let middle

    while(start <= end){
        count++
        middle = Math.floor((start + (end - start)/2))
        let guess = arr[middle]
        if(item == guess){
            position = middle
            return position
        }
        if(item > guess){
            start = middle + 1
        } else {
            end = middle - 1
        }
    }
    return position
}

//console.log(linearSearch(array, 70))
console.log(binarySearch(array, 11))
console.log(count)