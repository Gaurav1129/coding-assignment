document.addEventListener('DOMContentLoaded', () => {
    const taskInput = document.getElementById('taskInput');
    const addTaskBtn = document.getElementById('addTaskBtn');
    const taskList = document.getElementById('taskList');

    // Add task function
    function addTask(taskText) {
        if (taskText.trim() === '') return;

        const li = document.createElement('li');
        li.className = 'task-item';
        
        li.innerHTML = `
            <span>${taskText}</span>
            <button class="remove-btn">Remove</button>
        `;

        taskList.appendChild(li);
        taskInput.value = '';
        
        // Add event listener to remove button
        li.querySelector('.remove-btn').addEventListener('click', () => {
            li.remove();
        });
    }

    // Event listeners
    addTaskBtn.addEventListener('click', () => {
        addTask(taskInput.value);
    });

    taskInput.addEventListener('keypress', (e) => {
        if (e.key === 'Enter') {
            addTask(taskInput.value);
        }
    });
});