/*  1:   */ import com.google.common.util.concurrent.ThreadFactoryBuilder;
/*  2:   */ import io.netty.channel.nio.NioEventLoopGroup;
/*  3:   */ 
/*  4:   */ final class rd
/*  5:   */   extends up
/*  6:   */ {
/*  7:   */   protected NioEventLoopGroup a()
/*  8:   */   {
/*  9:40 */     return new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Server IO #%d").setDaemon(true).build());
/* 10:   */   }
/* 11:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     rd
 * JD-Core Version:    0.7.0.1
 */