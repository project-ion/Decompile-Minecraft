/*  1:   */ import java.nio.ByteBuffer;
/*  2:   */ import java.util.Iterator;
/*  3:   */ import java.util.List;
/*  4:   */ import org.lwjgl.opengl.GL11;
/*  5:   */ 
/*  6:   */ public class ciy
/*  7:   */ {
/*  8:   */   public int a(civ paramciv, int paramInt)
/*  9:   */   {
/* 10:   */     Iterator localIterator;
/* 11:   */     cuu localcuu;
/* 12:   */     cuw localcuw;
/* 13:   */     int j;
/* 14:16 */     if (paramInt > 0)
/* 15:   */     {
/* 16:17 */       cus localcus = paramciv.g();
/* 17:18 */       int i = localcus.f();
/* 18:19 */       ByteBuffer localByteBuffer = paramciv.f();
/* 19:20 */       List localList = localcus.g();
/* 20:22 */       for (localIterator = localList.iterator(); localIterator.hasNext();)
/* 21:   */       {
/* 22:22 */         localcuu = (cuu)localIterator.next();
/* 23:23 */         localcuw = localcuu.c();
/* 24:24 */         j = localcuu.b().c();
/* 25:25 */         int k = localcuu.e();
/* 26:26 */         switch (ciz.a[localcuw.ordinal()])
/* 27:   */         {
/* 28:   */         case 1: 
/* 29:28 */           localByteBuffer.position(localcuu.a());
/* 30:29 */           GL11.glVertexPointer(localcuu.d(), j, i, localByteBuffer);
/* 31:30 */           GL11.glEnableClientState(32884);
/* 32:31 */           break;
/* 33:   */         case 2: 
/* 34:33 */           localByteBuffer.position(localcuu.a());
/* 35:34 */           dax.l(dax.p + k);
/* 36:35 */           GL11.glTexCoordPointer(localcuu.d(), j, i, localByteBuffer);
/* 37:36 */           GL11.glEnableClientState(32888);
/* 38:37 */           dax.l(dax.p);
/* 39:38 */           break;
/* 40:   */         case 3: 
/* 41:40 */           localByteBuffer.position(localcuu.a());
/* 42:41 */           GL11.glColorPointer(localcuu.d(), j, i, localByteBuffer);
/* 43:42 */           GL11.glEnableClientState(32886);
/* 44:43 */           break;
/* 45:   */         case 4: 
/* 46:45 */           localByteBuffer.position(localcuu.a());
/* 47:46 */           GL11.glNormalPointer(j, i, localByteBuffer);
/* 48:47 */           GL11.glEnableClientState(32885);
/* 49:   */         }
/* 50:   */       }
/* 51:52 */       GL11.glDrawArrays(paramciv.i(), 0, paramciv.h());
/* 52:54 */       for (localIterator = localList.iterator(); localIterator.hasNext();)
/* 53:   */       {
/* 54:54 */         localcuu = (cuu)localIterator.next();
/* 55:55 */         localcuw = localcuu.c();
/* 56:56 */         j = localcuu.e();
/* 57:57 */         switch (ciz.a[localcuw.ordinal()])
/* 58:   */         {
/* 59:   */         case 1: 
/* 60:59 */           GL11.glDisableClientState(32884);
/* 61:60 */           break;
/* 62:   */         case 2: 
/* 63:62 */           dax.l(dax.p + j);
/* 64:63 */           GL11.glDisableClientState(32888);
/* 65:64 */           dax.l(dax.p);
/* 66:65 */           break;
/* 67:   */         case 3: 
/* 68:67 */           GL11.glDisableClientState(32886);
/* 69:68 */           cjm.G();
/* 70:69 */           break;
/* 71:   */         case 4: 
/* 72:71 */           GL11.glDisableClientState(32885);
/* 73:   */         }
/* 74:   */       }
/* 75:   */     }
/* 76:77 */     paramciv.a();
/* 77:78 */     return paramInt;
/* 78:   */   }
/* 79:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ciy
 * JD-Core Version:    0.7.0.1
 */