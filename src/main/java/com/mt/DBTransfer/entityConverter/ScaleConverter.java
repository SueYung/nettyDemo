package com.mt.DBTransfer.entityConverter;

import com.mt.DBTransfer.fromentity.Scale;
import com.mt.DBTransfer.toentity.Tscale;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
public class ScaleConverter implements Converter<Scale,Tscale>{

    @Override
    public Tscale convert(Scale fromscale, Tscale toscale) {
        toscale.setId(fromscale.getSCALE_NO()+"");
        toscale.setStore_no(0);
        toscale.setFolder_no(0);
        toscale.setScale_no(fromscale.getSCALE_NO());
        toscale.setIs_name_sync(0);
        toscale.setScale_ip(fromscale.getSCALE_IP());
        toscale.setScale_port(fromscale.getPORT());
        toscale.setIs_no_last_ip(0);
        toscale.setScale_type(String.valueOf(fromscale.getTYPR_ID()));
        toscale.setSub_type(String.valueOf(fromscale.getPSK_KEY_BOARD_NO()));
        toscale.setConn_type("Network");
        toscale.setIs_transmit(1);
        toscale.setIs_enabled(1);
        toscale.setIs_locked(1);
        toscale.setDelete_flag(0);
        toscale.setTicket_no(0);
        toscale.setIs_monitored(1);
        toscale.setMonitor_flag(1);
        toscale.setIs_readonly(1);
        toscale.setCreator(1);
        toscale.setC_datetime(new Timestamp(System.currentTimeMillis()));
        toscale.setC_location(1);
        toscale.setM_datetime(new Timestamp(System.currentTimeMillis()));
        
        return toscale;
    }

}
