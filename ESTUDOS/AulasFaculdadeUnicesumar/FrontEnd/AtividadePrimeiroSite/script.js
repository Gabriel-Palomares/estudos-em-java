//EFEITO DAS LETRAS NO SOBRE
const sectionSobre = document.querySelector('#sobre');
const nome = sectionSobre.querySelector('.nome'); // Seleciona a classe .nome

// Configura o Intersection Observer
const observer = new IntersectionObserver((entries) => {
    entries.forEach(entry => {
        if (entry.isIntersecting) {
            nome.classList.add('text-flicker-variable-speed'); // Adiciona a animação
        } else {
            nome.style.opacity = '0'; // Apaga o nome ao sair da visibilidade
        }
    });
}, {
    threshold: 0.5 // Ativado quando 50% da seção está visível
});

// Observa a seção #sobre
observer.observe(sectionSobre);


    ///transição suave ao clicar em intens ancora
    document.querySelectorAll('a[href^="#"]').forEach(anchor => {
      anchor.addEventListener('click', function (e) {
        e.preventDefault();
    
        document.querySelector(this.getAttribute('href')).scrollIntoView({
          behavior: 'smooth'
        });
      });
    });

    window.addEventListener('scroll', function () {
    const navbar = document.querySelector('.nav');
    if (window.scrollY > 0) {
        navbar.classList.add('transparent'); // Torna o fundo transparente
    } else {
        navbar.classList.remove('transparent'); // Volta ao fundo colorido no topo
    }
});

//javaScript para alterar os planos de fundo de #favoritos
const items = document.querySelectorAll('.item');
const favoritos = document.querySelector('#favoritos');

// Array com os caminhos das imagens
const imagens = [
    'imagens/discord-fundo.png',
    'imagens/Crunchyroll-fundo.jpg',
    'imagens/alura-fundo.jpg',
    'imagens/steam-fundo.jpg',
    'imagens/netflix-fundo.png'
];

// Caminho da imagem inicial
const imagemInicial = 'imagens/google-home-page.jpg';

// Garante que a imagem inicial já esteja carregada
favoritos.style.backgroundImage = `url('${imagemInicial}')`;
favoritos.style.backgroundSize = 'cover'; // Garante que preencha 100vh

items.forEach((item, index) => {
    item.addEventListener('mouseenter', () => {
        favoritos.style.backgroundImage = `url('${imagens[index]}')`; // Troca para a imagem do item
    });

    item.addEventListener('mouseleave', () => {
        favoritos.style.backgroundImage = `url('${imagemInicial}')`; // Volta à imagem inicial
    });
});

// alteração do fundo de educacao
const imagem = [
    "imagens/EtecAB.png",
    "imagens/UTFPR-CP.png",
    "imagens/UTFPR-PG.jpg",
    "imagens/Unicesumar-PG.png"
  ];
  
  // Seleciona todas as gavetas
  const gavetas = document.querySelectorAll(".gaveta");
  
  // Adiciona eventos para cada gaveta
  gavetas.forEach((gaveta, index) => {
    gaveta.addEventListener("mouseenter", () => {
      document.getElementById("educacao").style.backgroundImage = `url('${imagem[index]}')`;
    });
  
    gaveta.addEventListener("mouseleave", () => {
      document.getElementById("educacao").style.backgroundImage = "none"; // Remove a imagem ao sair
    });
  });