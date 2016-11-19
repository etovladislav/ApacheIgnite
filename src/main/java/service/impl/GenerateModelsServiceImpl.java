package service.impl;

import model.Client;
import model.Contract;
import model.Register;
import org.springframework.stereotype.Service;
import service.GenerateModelsService;

/**
 * Created by etovladislav on 19.11.16.
 */
@Service
public class GenerateModelsServiceImpl implements GenerateModelsService {

    @Override
    public void generate(Integer count) {
        Client client = new Client();
        Contract contract = new Contract();
        Register register = new Register();
    }
}
