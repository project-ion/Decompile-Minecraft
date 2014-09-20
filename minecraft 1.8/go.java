/*  1:   */ import io.netty.buffer.ByteBuf;
/*  2:   */ import io.netty.channel.ChannelHandlerContext;
/*  3:   */ import io.netty.handler.codec.MessageToByteEncoder;
/*  4:   */ import javax.crypto.Cipher;
/*  5:   */ 
/*  6:   */ public class go
/*  7:   */   extends MessageToByteEncoder
/*  8:   */ {
/*  9:   */   private final gm a;
/* 10:   */   
/* 11:   */   public go(Cipher paramCipher)
/* 12:   */   {
/* 13:13 */     this.a = new gm(paramCipher);
/* 14:   */   }
/* 15:   */   
/* 16:   */   protected void a(ChannelHandlerContext paramChannelHandlerContext, ByteBuf paramByteBuf1, ByteBuf paramByteBuf2)
/* 17:   */   {
/* 18:18 */     this.a.a(paramByteBuf1, paramByteBuf2);
/* 19:   */   }
/* 20:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     go
 * JD-Core Version:    0.7.0.1
 */