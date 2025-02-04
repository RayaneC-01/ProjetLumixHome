// scripts.js
document.querySelector('.login-form').addEventListener('submit', function (e) {
    e.preventDefault();
    
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;
    
    if (email === "user@example.com" && password === "password123") {
        Swal.fire({
            title: 'Succès !',
            text: 'Connexion réussie !',
            icon: 'success',
            confirmButtonText: 'Cool'
        });
    } else {
        Swal.fire({
            title: 'Erreur !',
            text: 'Identifiants incorrects. Veuillez réessayer.',
            icon: 'error',
            confirmButtonText: 'OK'
        });
    }
});
