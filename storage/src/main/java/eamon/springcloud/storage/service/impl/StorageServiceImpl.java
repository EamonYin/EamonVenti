package eamon.springcloud.storage.service.impl;

import eamon.springcloud.storage.entity.Storage;
import eamon.springcloud.storage.mapper.StorageMapper;
import eamon.springcloud.storage.service.StorageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Eamon
 * @since 2021-04-23
 */
@Service
public class StorageServiceImpl extends ServiceImpl<StorageMapper, Storage> implements StorageService {

}
