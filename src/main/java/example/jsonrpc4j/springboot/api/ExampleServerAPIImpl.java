package example.jsonrpc4j.springboot.api;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import org.springframework.stereotype.Service;

@Service
@AutoJsonRpcServiceImpl
public class ExampleServerAPIImpl implements ExampleServerAPI {

    @Override
    public int multiplier(int a, int b) {
        return a * b;
    }
}
