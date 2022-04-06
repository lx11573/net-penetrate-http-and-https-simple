package com.kele.penetrate.receiver.https;

import com.kele.penetrate.Start;
import com.kele.penetrate.enumeration.HypertextTransferProtocolType;
import com.kele.penetrate.pojo.PipelineTransmission;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.*;


public class NettyHttpsServerHandler extends SimpleChannelInboundHandler<FullHttpRequest>
{
    /*
     * 处理请求
     */
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, FullHttpRequest fullHttpRequest)
    {
        Start.hypertextProtocolEvents.notice(new PipelineTransmission(channelHandlerContext, fullHttpRequest, HypertextTransferProtocolType.HTTPS));
    }


}
