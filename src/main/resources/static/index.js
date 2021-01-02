let marsRoverButton = document.querySelectorAll("button[id*='marsApi']")

marsRoverButton.forEach(button => button.addEventListener('click', function () {
    const buttonId = this.id
    const roverId = buttonId.split('marsApi')[1]
    let marsApiData = document.getElementById('marsApiRoverData')
    marsApiData.value = roverId
    document.getElementById('formRover').submit()
}))

function getUrlParameter(name) {
    name = name.replace(/[\[]/, '\\[').replace(/[\]]/, '\\]');
    var regex = new RegExp('[\\?&]' + name + '=([^&#]*)');
    var results = regex.exec(location.search);
    return results === null ? '' : decodeURIComponent(results[1].replace(/\+/g, ' '));
};

let marsRoverType = document.getElementById('marsApiRoverData').value
highlightButton(marsRoverType)

let marsSol = document.getElementById('marsSol').value
if (marsSol != null && marsSol != '' && marsSol >= 0) {
    document.getElementById('marsSol').value = marsSol
}

function highlightButton(roverType) {
    if (roverType == '') {
        roverType = 'Opportunity'
    }
    document.getElementById('marsApi'+roverType).classList.remove('btn-secondary')
    document.getElementById('marsApi'+roverType).classList.add('btn-primary')
}


