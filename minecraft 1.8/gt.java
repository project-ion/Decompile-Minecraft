/*  1:   */ import com.google.common.util.concurrent.ThreadFactoryBuilder;
/*  2:   */ import io.netty.channel.local.LocalEventLoopGroup;
/*  3:   */ 
/*  4:   */ final class gt
/*  5:   */   extends up
/*  6:   */ {
/*  7:   */   protected LocalEventLoopGroup a()
/*  8:   */   {
/*  9:53 */     return new LocalEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Client IO #%d").setDaemon(true).build());
/* 10:   */   }
/* 11:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     gt
 * JD-Core Version:    0.7.0.1
 */