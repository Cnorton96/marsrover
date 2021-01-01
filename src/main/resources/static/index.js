let marsRoverButton = document.querySelectorAll("button[id*='marsApi']")

marsRoverButton.forEach(button => button.addEventListener('click', function(){
    const buttonId = this.id
    const roverId = buttonId.split('marsApi')[1]
    let marsApiData = document.getElementById('marsApiRoverData')
    marsApiData.value = roverId
    document.getElementById('formRover').submit()
}))


