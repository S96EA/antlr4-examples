package csv;

import java.util.*;

public class CSVVisitorImpl extends CSVBaseVisitor<String> {
    List<Map<String, String>> list = new ArrayList<>();
    List<String> head = new ArrayList<>();

    @Override
    public String visitFile(CSVParser.FileContext ctx) {
        super.visitFile(ctx);
        list.remove(0);
        return list.toString();
    }

    @Override
    public String visitHdr(CSVParser.HdrContext ctx) {
        ctx.row().field().forEach(fieldContext -> head.add(fieldContext.getText()));
        return super.visitHdr(ctx);
    }

    @Override
    public String visitRow(CSVParser.RowContext ctx) {
        Map<String, String> map = new LinkedHashMap<>();
        for (int i = 0; i < head.size(); i++) {
            map.put(head.get(i), visit(ctx.field(i)));
        }
        list.add(map);
        return super.visitRow(ctx);
    }

    @Override
    public String visitText(CSVParser.TextContext ctx) {
        return ctx.TEXT().getText();
    }

    @Override
    public String visitString(CSVParser.StringContext ctx) {
        return ctx.STRING().getText();
    }

    @Override
    public String visitEmpty(CSVParser.EmptyContext ctx) {
        return "";
    }
}
