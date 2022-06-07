export interface IProduto {
  id: number;
  descricao: string;
  preco: number;
  descricaoPreco: string;
  imagem: string;
}

export const produtos = [
  { id: 1, descricao: "Mouse gamer", preco: 439.00, descricaoPreco: "À vista no PIX", imagem: "/assets/mouse-gamer.png" },
  { id: 2, descricao: "Monitor gamer", preco: 1339.50, descricaoPreco: "À vista no PIX", imagem: "/assets/monitor-gamer.png" },
  { id: 3, descricao: "Teclado mecânico", preco: 769.00, descricaoPreco: "À vista no PIX", imagem: "/assets/teclado-mecanico.png" },
  { id: 4, descricao: "Headphone gamer", preco: 599.00, descricaoPreco: "À vista no PIX", imagem: "/assets/headphone-gamer.png" },
  { id: 5, descricao: "Fone de ouvido", preco: 199.00, descricaoPreco: "À vista no PIX", imagem: "/assets/fone-de-ouvido.png" },
  { id: 6, descricao: "Fone de ouvido Apple", preco: 939.00, descricaoPreco: "À vista no PIX", imagem: "/assets/fone-de-ouvido-apple.png" },
  { id: 7, descricao: "HD 1TB", preco: 499.00, descricaoPreco: "À vista no PIX", imagem: "/assets/hd-1tb.png" },
  { id: 8, descricao: "Combo de Placa de Vídeo", preco: 18939.00, descricaoPreco: "À vista no PIX", imagem: "/assets/combo-placa.png" },
  { id: 9, descricao: "Processador Ryzen", preco: 1000.00, descricaoPreco: "À vista no PIX", imagem: "/assets/processador-ryzen.png" },
  { id: 10, descricao: "Notebook profissional", preco: 2539.00, descricaoPreco: "À vista no PIX", imagem: "/assets/notebook-profissional.png" },
  { id: 11, descricao: "Notebook gamer", preco: 4599.00, descricaoPreco: "À vista no PIX", imagem: "/assets/notebook-gamer.png" },
  { id: 12, descricao: "Mouse simples", preco: 29.00, descricaoPreco: "À vista no PIX", imagem: "/assets/mouse-simples.png" },
  { id: 13, descricao: "Mouse profissional", preco: 239.00, descricaoPreco: "À vista no PIX", imagem: "/assets/mouse-profissional.png" },
  { id: 13, descricao: "Mouse sem fio", preco: 69.00, descricaoPreco: "À vista no PIX", imagem: "/assets/mouse-semfio.png" },
  { id: 13, descricao: "Teclado profissional", preco: 239.00, descricaoPreco: "À vista no PIX", imagem: "/assets/teclado-profissional.png" }
]
