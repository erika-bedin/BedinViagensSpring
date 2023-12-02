function criarHeader() {
  const header = document.createElement('nav');
  header.className = 'navbar navbar-expand-md navbar-dark bg-dark';
  
  const container = document.createElement('div');
  container.className = 'container';

  const logo1 = document.createElement('img');
  logo1.src = '/img/logolimpa.png';
  logo1.alt = 'Logotipo da agência de viagens';
  logo1.width = '80';

  const logo2 = document.createElement('img');
  logo2.src = '/img/bedinviagens.png';
  logo2.alt = 'Logotipo da Bedin viagens';
  logo2.width = '250';

  const brandLink = document.createElement('a');
  brandLink.className = 'navbar-brand';
  brandLink.href = '/index.html';

  const themeButtons = document.createElement('div');
  themeButtons.className = 'btn-group mx-2';
  themeButtons.role = 'group';
  themeButtons.setAttribute('aria-label', 'Basic radio toggle button group');

  const lightModeInput = document.createElement('input');
  lightModeInput.type = 'radio';
  lightModeInput.className = 'btn-check';
  lightModeInput.name = 'btnradio';
  lightModeInput.id = 'btnClaro';
  lightModeInput.autocomplete = 'off';

  const lightModeLabel = document.createElement('label');
  lightModeLabel.className = 'btn btn-outline-secondary';
  lightModeLabel.setAttribute('for', 'btnClaro');
  lightModeLabel.textContent = '🌞';

  const darkModeInput = document.createElement('input');
  darkModeInput.type = 'radio';
  darkModeInput.className = 'btn-check';
  darkModeInput.name = 'btnradio';
  darkModeInput.id = 'btnEscuro';
  darkModeInput.autocomplete = 'off';

  const darkModeLabel = document.createElement('label');
  darkModeLabel.className = 'btn btn-outline-secondary';
  darkModeLabel.setAttribute('for', 'btnEscuro');
  darkModeLabel.textContent = '🌚';

  const menuCollapseDiv = document.createElement('div');
  menuCollapseDiv.className = 'collapse navbar-collapse';
  menuCollapseDiv.id = 'navbarNav';

  const menuList = document.createElement('ul');
  menuList.className = 'navbar-nav ms-auto';

  const menuItems = [
    { text: 'Início', link: '/' },
    { text: 'Cadastro', link: '/cliente'},
    { text: 'Destinos', link: '/destino' },
    { text: 'Promoções', link: '/promocoes' },
    { text: 'Contato', link: '/contato' },
  ];

  menuItems.forEach(item => {
    const menuItem = document.createElement('li');
    menuItem.className = 'nav-item';
    const menuItemLink = document.createElement('a');
    menuItemLink.className = 'nav-link';
    menuItemLink.href = item.link;
    menuItemLink.textContent = item.text;
    menuItem.appendChild(menuItemLink);
    menuList.appendChild(menuItem);
  });

  menuCollapseDiv.appendChild(menuList);

  // Criação do botão de hamburger
  const menuHamburgerButton = document.createElement('button');
  menuHamburgerButton.className = 'navbar-toggler';
  menuHamburgerButton.type = 'button';
  menuHamburgerButton.setAttribute('data-bs-toggle', 'collapse');
  menuHamburgerButton.setAttribute('data-bs-target', '#navbarNav');
  menuHamburgerButton.setAttribute('aria-controls', 'navbarNav');
  menuHamburgerButton.setAttribute('aria-expanded', 'false');
  menuHamburgerButton.setAttribute('aria-label', 'Toggle navigation');

  // Ícone do botão de hamburger
  const menuHamburgerIcon = document.createElement('span');
  menuHamburgerIcon.className = 'navbar-toggler-icon';
  menuHamburgerButton.appendChild(menuHamburgerIcon);

  // Adicione todos os elementos ao header
  themeButtons.appendChild(lightModeInput);
  themeButtons.appendChild(lightModeLabel);
  themeButtons.appendChild(darkModeInput);
  themeButtons.appendChild(darkModeLabel);

  container.appendChild(logo1);
  container.appendChild(logo2);
  container.appendChild(brandLink);
  container.appendChild(themeButtons);
  container.appendChild(menuCollapseDiv);
  container.appendChild(menuHamburgerButton);

  header.appendChild(container);

  return header;
}

// Agora, chame a função criarHeader() e adicione o header ao DOM
const headerElement = criarHeader();
document.getElementById('header').appendChild(headerElement);


function configurarHeaderEFooter() {
// Destacar o item do navbar ativo na página atual
const paginaAtual = document.body.id;
const linksNavbar = document.querySelectorAll('.nav-link');
linksNavbar.forEach(link => {
  if (link.getAttribute('href') === paginaAtual + '.jsp') {
    link.classList.add('active');
  } else {
    link.classList.remove('active');
  }
});
}

function configurarFooter() {
  const footer = document.querySelector('footer');
  if (footer) {
    footer.className = 'footer footer-dark bg-dark text-white text-center';  
    const footerContent = `
      Bedin Viagens© 2023. Desenvolvido por 🌺 <a href="https://github.com/erika-bedin">Érika Bedin</a> 👩🏼‍💻. <br> Todos os direitos reservados (fins educacionais).
    `;  
    footer.innerHTML = footerContent;  
  }
}

// Chame a função para configurar o footer
configurarFooter();

// Chama as funções e destacar item de navegação
document.addEventListener("DOMContentLoaded", function() { 
  configurarHeaderEFooter();
});

