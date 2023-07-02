var Reizen;

function reisview() {
    var returnPromise = service_getreizen();

    returnPromise.then(response => {
        if (response.ok) {
            // alert("Nu is ie pas klaar");
            response.json().then(data => {
                //build the result html into the list

                var html = '<TABLE><TBODY><TR><TD>Land</TD><TD>Continent</TD><TD>Dagen</TD><TD>Personen</TD></TR>'
                html += '<TR><TD>&nbsp</TD></TR>';

                for (var i=0; i<data.length; i++)
                {
                    var item = data[i];

                    html += '<TR><TD>' + item.naam + '</TD><TD>' + item.contintent + '</TD><TD>';
                    html += '<TD>' + item.aantalDagen + '</TD><TD>' + item.aantalPersonen + '</TD>';
                    html += '<TD><a href="restservices/reizen/verwijderreis?id='+ i +'">Delete</a></TD>'
                    html += '<TD><a href="ReisMuteren.html?id='+ i;
                    html += '&reisNaam=' + item.naam;
                    html += '&aantalPersonen=' + item.aantalPersonen;
                    html += '&continent=' + item.contintent;
                    html += '&aantalDagen=' + item.aantalDagen +'">Update</a></TD></TR>';
                }
                html += '</TBODY></TABLE>';

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