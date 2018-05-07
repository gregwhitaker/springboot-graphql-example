package springboot.graphql.example.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import springboot.graphql.example.data.LinkRepository;
import springboot.graphql.example.data.model.Link;

import java.util.List;

@Component
public class LinkQuery implements GraphQLQueryResolver {

    @Autowired
    private LinkRepository linkRepository;

    public List<Link> allLinks() {
        return linkRepository.findAll();
    }
}
