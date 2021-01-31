import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import dto.Certificate;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class ParserService {

    private String filePath;

    public ParserService(){

    }

    public ParserService(String filePath) {
        super();
        this.filePath = filePath;
    }



    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void doYamlParsing(){
        Certificate cert = parseYaml();
        printCertificate(cert);
    }


    private void printCertificate(Certificate cert ){
        if(requiredBase64Encoding(cert)){
            String base64encodedString = null;
            try {
                base64encodedString = Base64.getEncoder().encodeToString(cert.getSpec().getSignedCert().getCert().getBytes("utf-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            System.out.println("*****Output *****\n"+base64encodedString);

        }else{
            System.out.println("*****Output *****\n"+cert.getSpec().getSignedCert().getCert());
        }
    }

    private Certificate parseYaml(){
        ObjectMapper mapper =new ObjectMapper(new YAMLFactory().disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER));
        mapper.findAndRegisterModules();
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        Certificate cert=null;
        try {
            cert= mapper.readValue(new File(filePath), Certificate.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cert;
    }

    private boolean requiredBase64Encoding(Certificate cert){
        return OnboardingStyle.PARTNERONBOARDING.toString().equalsIgnoreCase(cert.getLabels().getPartOf());
    }
}
