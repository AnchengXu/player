package top.anchengxu.player.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.anchengxu.player.dao.SourceDao;
import top.anchengxu.player.model.Source;
import top.anchengxu.player.service.SourceService;

@Service(value = "sourceService")
public class SourceServiceImpl implements SourceService {

    @Autowired
    SourceDao sourceDao;

    @Override
    public Source selectSource(String name) {
        Source source = sourceDao.selectSource(name);
        return source;
    }
}
