const images = [
    'https://picsum.photos/id/1015/1000/600', 
    'https://picsum.photos/id/1040/1000/600',
    'https://picsum.photos/id/1036/1000/600', 
    'https://picsum.photos/id/1057/1000/600', 
    'https://picsum.photos/id/1062/1000/600'
];


let currentIndex = 0;
const sliderImage = document.getElementById('currentImage');
const dotsContainer = document.querySelector('.dots-container');

// Initialize slider
function initializeSlider() {
    // Create dots
    images.forEach((_, index) => {
        const dot = document.createElement('div');
        dot.classList.add('dot');
        if (index === 0) dot.classList.add('active');
        dot.addEventListener('click', () => showImage(index));
        dotsContainer.appendChild(dot);
    });

    // Set initial image
    sliderImage.src = images[currentIndex];
}

// Show specific image
function showImage(index) {
    currentIndex = (index + images.length) % images.length;
    
    document.querySelectorAll('.dot').forEach(dot => 
        dot.classList.remove('active'));
        
    sliderImage.classList.remove('active');
    setTimeout(() => {
        sliderImage.src = images[currentIndex];
        sliderImage.classList.add('active');
        dotsContainer.children[currentIndex].classList.add('active');
    }, 300);
}

// Navigation handlers
document.querySelector('.prev-btn').addEventListener('click', () => {
    showImage(currentIndex - 1);
});

document.querySelector('.next-btn').addEventListener('click', () => {
    showImage(currentIndex + 1);
});

// Keyboard navigation
document.addEventListener('keydown', (e) => {
    if (e.key === 'ArrowLeft') showImage(currentIndex - 1);
    if (e.key === 'ArrowRight') showImage(currentIndex + 1);
});

// Initialize the slider
initializeSlider();