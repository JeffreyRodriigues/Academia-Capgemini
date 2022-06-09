export interface IProduto {
  id: number;
  descricao: string;
  preco: number;
  descricaoPreco: string;
  quantidadeEstoque: number;
  imagem: string;
}

export interface IProdutoCarrinho extends IProduto {
  quantidade: number;
}

export const produtos: IProduto[] = [
  { id: 1, descricao: "Mouse gamer", preco: 439.00, descricaoPreco: "À vista no PIX", imagem: "/assets/mouse-gamer.jpg", quantidadeEstoque: 20 },
  { id: 2, descricao: "Monitor gamer", preco: 1339.50, descricaoPreco: "À vista no PIX", imagem: "/assets/monitor-gamer.jpg", quantidadeEstoque: 15 },
  { id: 3, descricao: "Teclado mecânico", preco: 769.00, descricaoPreco: "À vista no PIX", imagem: "/assets/teclado-mecanico.jpg", quantidadeEstoque: 10 },
  { id: 4, descricao: "Headphone gamer", preco: 599.00, descricaoPreco: "À vista no PIX", imagem: "/assets/headphone-gamer.jpg", quantidadeEstoque: 10 },
  { id: 5, descricao: "Fone de ouvido", preco: 199.00, descricaoPreco: "À vista no PIX", imagem: "/assets/fone-de-ouvido.jpg", quantidadeEstoque: 10 },
  { id: 6, descricao: "Fone de ouvido Apple", preco: 939.00, descricaoPreco: "À vista no PIX", imagem: "/assets/fone-de-ouvido-apple.jpg", quantidadeEstoque: 10 },
  { id: 7, descricao: "HD 1TB", preco: 499.00, descricaoPreco: "À vista no PIX", imagem: "/assets/hd-1tb.jpg", quantidadeEstoque: 10 },
  { id: 8, descricao: "Combo gamer", preco: 18939.00, descricaoPreco: "À vista no PIX", imagem: "/assets/combo-placa.jpg", quantidadeEstoque: 10 },
  { id: 9, descricao: "Processador Ryzen", preco: 1000.00, descricaoPreco: "À vista no PIX", imagem: "/assets/processador-ryzen.jpg", quantidadeEstoque: 10 },
  { id: 10, descricao: "Notebook profissional", preco: 2539.00, descricaoPreco: "À vista no PIX", imagem: "/assets/notebook-profissional.jpg", quantidadeEstoque: 10 },
  { id: 11, descricao: "Notebook gamer", preco: 4599.00, descricaoPreco: "À vista no PIX", imagem: "/assets/notebook-gamer.jpg", quantidadeEstoque: 10 },
  { id: 12, descricao: "Mouse simples", preco: 29.00, descricaoPreco: "À vista no PIX", imagem: "/assets/mouse-simples.jpg", quantidadeEstoque: 10 },
  { id: 13, descricao: "Mouse profissional", preco: 239.00, descricaoPreco: "À vista no PIX", imagem: "/assets/mouse-profissional.jpg", quantidadeEstoque: 10 },
  { id: 14, descricao: "Mouse sem fio", preco: 69.00, descricaoPreco: "À vista no PIX", imagem: "/assets/mouse-semfio.jpg", quantidadeEstoque: 10 },
  { id: 15, descricao: "Teclado profissional", preco: 239.00, descricaoPreco: "À vista no PIX", imagem: "/assets/teclado-profissional.jpg", quantidadeEstoque: 10 }
];
