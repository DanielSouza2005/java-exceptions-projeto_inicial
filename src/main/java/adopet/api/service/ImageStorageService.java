package adopet.api.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
public class ImageStorageService {

    private static final String PASTA_UPLOAD = System.getProperty("user.dir") + "/src/main/resources/storage/";

    public String upload(MultipartFile imagem) {

        String novoNome = this.gerarNovoNome(imagem.getOriginalFilename());

        String caminhoCompletoDoArquivo = PASTA_UPLOAD + novoNome;

        try {
            imagem.transferTo(new File(caminhoCompletoDoArquivo));
        }catch (IOException e){
            throw new RuntimeException(e);
        }

        return novoNome;
    }

    private String gerarNovoNome(String nomeOriginal)
    {
        String[] nomeSplit = nomeOriginal.split("\\.");
        String extensao = "." + nomeSplit[1];

        return UUID.randomUUID() + extensao;
    }

}
