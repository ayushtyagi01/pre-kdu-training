var val = 0;
document.getElementById("value").innerText = val;
function increment() {
    val = val + 1;
    console.log(val);
    document.getElementById("value").innerText = val;
}
function decrement() {
    val = val - 1;
    document.getElementById("value").innerText = val;
}