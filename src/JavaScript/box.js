document.addEventListener('DOMContentLoaded', function () {
    document.getElementById("doboz").addEventListener("mousemove", function (ev) {
        let x = document.getElementById("input1");
        let y = document.getElementById("input2");
        x.value = ev.offsetX;
        y.value = ev.offsetY;
    });

    document.getElementById("doboz").addEventListener("mousemove", function (ev) {
        let x = document.getElementById("input1");
        let y = document.getElementById("input2");
        x.value = ev.offsetX;
        y.value = ev.offsetY;
        this.style.backgroundColor = `rgb(${ev.offsetX},${ev.offsetX},${ev.offsetX})`;
    });

});
