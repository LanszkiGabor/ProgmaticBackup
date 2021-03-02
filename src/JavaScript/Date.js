function getHunWeekday(date){
    let dateCopy = new Date(date);
    let hunDays = ["Vasárnap","Hétfő","Kedd","Szerda","Csütörtök","Péntek","Szombat"]
        return hunDays[dateCopy.getDay()];

}
console.log(getHunWeekday("2021-01-10"))




function f2(date,dayAgo){
    let dateCopy = new Date(date);
    return new Date(dateCopy - (dayAgo * 24 * 3600 * 1000));
}
console.log(f2("2020-01-13",3));




function getTheFirstCharUpperCase(text){
    let firstChar = text[0];
    let result = firstChar.toUpperCase();
    result = result + text.substr(1,text.length-1);
    return result;
}
console.log(getTheFirstCharUpperCase("hello"));


function badLanguage(text,bannedList){
    bannedList.forEach(function (index){
        console.log(bannedList[index]);
        if (text.includes(bannedList[index])){
            return true;
        }
        return false;
    })
}

let text2 = "Mivan baszdmeg te buzi fasz.";
let bannedList = ["baszdmeg", "buzi", "fasz"];
console.log(badLanguage(text2,bannedList));


let text1 = "hello";
let text22 = " ";
let text3 = "world";

console.log(text1.concat(text22,text3));

