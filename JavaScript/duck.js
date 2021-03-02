document.addEventListener('DOMContentLoaded', function () {
    document.getElementById('money').addEventListener("click", function () {
        let x = document.createTextNode(`Ennyi pénzt kapott ${Math.ceil(Math.random() * 1000)}$`);
        let y = document.createElement('p');
        y.appendChild(x);
        document.getElementById('message').appendChild(y);
    });

    document.getElementById('pic').addEventListener("click", function () {
        let randomImage = [];
        randomImage[0] = 'https://hang.hu/wp-content/uploads/2019/06/dagobert.jpg';
        randomImage[1] = 'https://hang.hu/wp-content/uploads/2019/06/dagobert.jpg';
        randomImage[2] = 'https://img.444.hu/dagobertck.jpg';
        randomImage[3] = 'https://img2.hvg.hu/image.aspx?id=159a18a8-49dc-49af-9b53-ca7b01544ee9&view=7fcefbf8-ac48-4ee6-aef5-32203afa118c';

        let randomGenerator = -1;

        if (randomGenerator < 0) {
            let pics = document.createElement('img');
            pics.setAttribute('id', 'pictureID');
            let x = document.getElementById('message');
            let y = document.getElementById('par');
            x.insertBefore(pics, y);
        }

        randomGenerator = Math.floor(Math.random() * randomImage.length);
        document.getElementById('pictureID').setAttribute('src', randomImage[randomGenerator]);
        document.getElementById('pictureID').width = '300';
        document.getElementById('pictureID').height = '300';
    });

});
