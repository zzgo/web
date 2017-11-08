package com.zzgo.web.service.impl;

import com.zzgo.web.mapper.SensorMapper;
import com.zzgo.web.model.PageData;
import com.zzgo.web.model.Sensor;
import com.zzgo.web.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 9527 on 2017/11/8.
 */
@Service
@Transactional
public class SensorServiceImpl implements SensorService {

    @Autowired
    private SensorMapper sensorMapper;

    public void save(Sensor sensor) {
        sensorMapper.save(sensor);
    }

    public void delete(int id) {
        sensorMapper.delete(id);
    }

    public void update(int id, Sensor sensor) {
        sensor.setId(id);
        sensorMapper.update(sensor);
    }

    public List<Sensor> findAll() {
        return sensorMapper.findAll();
    }

    public List<Sensor> findByPage(PageData page) {
        return sensorMapper.findByPage(page);
    }

    public int getCount() {
        return sensorMapper.getCount();
    }

    public Sensor findOne(int id) {
        return sensorMapper.findOne(id);
    }
}
