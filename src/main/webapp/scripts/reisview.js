var Reizen; //arraylist<kennisitem> currently in the list

function reisview() {
    var returnPromise = service_getreizen();

    returnPromise.then(response => {
        if (response.ok) {
            alert("Nu is ie pas klaar");
            response.json().then(data => {
                //build the result html into the list
                var html = "";
                for (var i=0; i<data.length; i++)
                {
                    var item = data[i];
                    html += '<div class="rij"><div class="reisnaam">';
                    html += item.naam;
                    html += '</div><div class="continent">';
                    html += item.continent;
                    html += '</div><div class="aantaldagen">';
                    html += item.aantalDagen
                    html += '</div><div class="aantalPersonen">';
                    html += item.aantalPersonen
                    html += '</div></div>';

                }
                var lijstContainer = document.getElementById("lijst");
                lijstContainer.innerHTML = html;
            })
        } else {
            console.log('Ooops');
            //show some nice errormessage to the user
            //TODO
        }
    });
}