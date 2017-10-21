package log;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LogVisitorImpl extends LogBaseVisitor {
    List<String> ips;

    public LogVisitorImpl() {
        this.ips = new ArrayList<>();
    }

    @Override
    public Object visitIp(LogParser.IpContext ctx) {
        ips.add(ctx.INT().stream().map(ParseTree::getText).collect(Collectors.joining(".")));
        return null;
    }
}
