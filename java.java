// Sample data
const data = {
    labels: ['Movie 1', 'Movie 2', 'Movie 3', 'Movie 4'],
    datasets: [
        {
            label: 'Actor Age',
            data: [50, 60, 45, 70],
            backgroundColor: 'rgba(54, 162, 235, 0.6)',
        },
        {
            label: 'Actress Age',
            data: [25, 30, 28, 35],
            backgroundColor: 'rgba(255, 99, 132, 0.6)',
        }
    ]
};

// Chart configuration
const config = {
    type: 'bar',
    data: data,
    options: {
        responsive: true,
        plugins: {
            legend: {
                position: 'top',
            },
            title: {
                display: true,
                text: 'Age Gap in Popular Movies'
            }
        }
    }
};

// Render the chart
const ctx = document.getElementById('chart').getContext('2d');
new Chart(ctx, config);