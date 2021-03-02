function distance() {
    console.log(eladott[eladott.length - 1].hely);
    console.log(eladott[eladott.length - 1].le - eladott[eladott.length - 1].fel);
}

distance();


function wholeTrip() {
    for (let x = 0; x < eladott.length; x++) {
        if (eladott[x].fel === 0 && eladott[x].le === vonalhossz) {
            console.log(eladott[x].hely);
        }
    }
}

wholeTrip();


/*function incoming() {
    let sum = 0;
    let distanceArray = [];
    for (let i = 0; i < eladott.length; i++) {
        distanceArray.push(eladott[i].le - eladott[i].fel);
    }
    for (let i = 0; i < distanceArray.length; i++) {
        if ()
    }
}*/

function countIncome() {
    let sumIncome = 0;
    for (let i = 0; i < eladott.length; i++) {
        let distanceTravelled = eladott[i].le - eladott[i].fel;
        let multiplier = Math.ceil(distanceTravelled / 10);
        let income = egysegar * multiplier;
        sumIncome = sumIncome + income;
    }
    console.log(sumIncome);
}

countIncome();


function passengerCounter() {
    let counter = 0;
    for (let x = 0; x < eladott.length; x++) {
        if (eladott[x].fel === 165 || eladott[x].le === 165) {
            counter++;
        }
    }
    console.log(counter);
}

passengerCounter();


function stopsCounter() {
    let array = [];
    let getOn = 0;
    let getOff = 0;
    for (let i = 0; i < eladott.length; i++) {
        getOn = eladott[i].fel;
        getOff = eladott[i].le;
        if (!array.includes(getOn)) {
            array.push(getOn);
        }
        if (!array.includes(getOff)) {
            array.push(getOff);
        }
    }
    console.log(array.length)
}

stopsCounter();


function passengerList() {
    let km = prompt("Adja meg az ellenőrizni kívánt kilométert", "");
    let passengerMap = new Map();

    for (let i = 0; i < eladott.length; i++) {
        passengerMap.set(i, eladott[i].hely);
        if ()

        if (km === eladott[i].fel){
            return i;
        }

    }
    console.log(passengerMap);
}

passengerList();
