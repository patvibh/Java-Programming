let marks = [85, 98, 67, 90, 69];
let sum = 0;
for (let val of marks) {
    sum += val;
}
let avg = sum /marks.length;
console.log(`avg marks of the class = ${avg}`);
