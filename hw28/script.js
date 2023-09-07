
function main() {
    const btn_select = document.querySelectorAll('.btn.btn-primary.select');
    const btn_order = document.getElementById("btn_order");
    let sum = 0;
    btn_select.forEach(e => {
        e.addEventListener("click", () => {
            if (e.innerHTML == "Unselect") {
                e.parentNode.parentNode.style.backgroundColor = "white";
                sum = sum - parseFloat(e.parentNode.parentNode.children[4].innerHTML.replace('$', '').replace(",", ""));
                e.innerHTML = "Select";
            }
            else {
                e.parentNode.parentNode.style.backgroundColor = "#5cb85c";
                sum = sum + parseFloat(e.parentNode.parentNode.children[4].innerHTML.replace('$', '').replace(",", ""));
                e.innerHTML = "Unselect";
            }
        })
    });

    btn_order.addEventListener("click", () => {
        if (sum != 0) {
            swal(`The purchase of ${sum}$ has been successfully approved`, '', "success")
        }
        else {
            swal(`You did not choose a car to buy!`, '', "error");
        }
    })

}

main();





