/*  1:   */ import io.netty.buffer.ByteBuf;
/*  2:   */ import io.netty.channel.ChannelHandlerContext;
/*  3:   */ import io.netty.handler.codec.MessageToMessageDecoder;
/*  4:   */ import java.util.List;
/*  5:   */ import javax.crypto.Cipher;
/*  6:   */ 
/*  7:   */ public class gn
/*  8:   */   extends MessageToMessageDecoder
/*  9:   */ {
/* 10:   */   private final gm a;
/* 11:   */   
/* 12:   */   public gn(Cipher paramCipher)
/* 13:   */   {
/* 14:14 */     this.a = new gm(paramCipher);
/* 15:   */   }
/* 16:   */   
/* 17:   */   protected void a(ChannelHandlerContext paramChannelHandlerContext, ByteBuf paramByteBuf, List paramList)
/* 18:   */   {
/* 19:19 */     paramList.add(this.a.a(paramChannelHandlerContext, paramByteBuf));
/* 20:   */   }
/* 21:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     gn
 * JD-Core Version:    0.7.0.1
 */