package br.unitins.topicos1.service;

import java.util.List;

import br.unitins.topicos1.dto.ProdutoDTO;
import br.unitins.topicos1.dto.ProdutoResponseDTO;

public interface ProdutoService {
    
    public ProdutoResponseDTO insert(ProdutoDTO dto);

    public ProdutoResponseDTO update(ProdutoDTO dto, Long id);

    public ProdutoResponseDTO updateNomeImagem(Long id, String nomeImagem) ;

    public void delete(Long id);

    public ProdutoResponseDTO findById(Long id);

    public List<ProdutoResponseDTO> findByNome(String nome);

    public List<ProdutoResponseDTO> findByEstoque(Integer estoque);
    
    public List<ProdutoResponseDTO> findByAll();

    public ProdutoResponseDTO findById(); 

}