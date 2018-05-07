package springboot.graphql.example.data;

import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;
import springboot.graphql.example.data.model.Link;

import java.util.List;

@Component
public class LinkRepository {

    private final List<Link> links = Lists.newArrayList();

    public LinkRepository() {
        links.add(new Link("https://www.netifi.com", "Autonomous microservices platform"));
        links.add(new Link("http://howtographql.com", "Your favorite GraphQL page"));
        links.add(new Link("http://graphql.org/learn/", "The official docks"));
    }

    public List<Link> findAll() {
        return links;
    }

    public void save(Link link) {
        links.add(link);
    }
}
