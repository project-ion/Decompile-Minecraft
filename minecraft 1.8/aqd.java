/*   1:    */ import java.util.ArrayList;
/*   2:    */ 
/*   3:    */ public class aqd
/*   4:    */   extends ArrayList
/*   5:    */ {
/*   6:    */   public aqd() {}
/*   7:    */   
/*   8:    */   public aqd(fn paramfn)
/*   9:    */   {
/*  10: 22 */     a(paramfn);
/*  11:    */   }
/*  12:    */   
/*  13:    */   public aqc a(amj paramamj1, amj paramamj2, int paramInt)
/*  14:    */   {
/*  15: 27 */     if ((paramInt > 0) && (paramInt < size()))
/*  16:    */     {
/*  17: 29 */       aqc localaqc1 = (aqc)get(paramInt);
/*  18: 30 */       if ((amj.c(paramamj1, localaqc1.a())) && (((paramamj2 == null) && (!localaqc1.c())) || ((localaqc1.c()) && (amj.c(paramamj2, localaqc1.b())) && 
/*  19: 31 */         (paramamj1.b >= localaqc1.a().b) && ((!localaqc1.c()) || (paramamj2.b >= localaqc1.b().b))))) {
/*  20: 32 */         return localaqc1;
/*  21:    */       }
/*  22: 35 */       return null;
/*  23:    */     }
/*  24: 37 */     for (int i = 0; i < size(); i++)
/*  25:    */     {
/*  26: 38 */       aqc localaqc2 = (aqc)get(i);
/*  27: 39 */       if ((amj.c(paramamj1, localaqc2.a())) && (paramamj1.b >= localaqc2.a().b) && (((!localaqc2.c()) && (paramamj2 == null)) || ((localaqc2.c()) && (amj.c(paramamj2, localaqc2.b())) && (paramamj2.b >= localaqc2.b().b)))) {
/*  28: 40 */         return localaqc2;
/*  29:    */       }
/*  30:    */     }
/*  31: 43 */     return null;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void a(hd paramhd)
/*  35:    */   {
/*  36: 72 */     paramhd.writeByte((byte)(size() & 0xFF));
/*  37: 73 */     for (int i = 0; i < size(); i++)
/*  38:    */     {
/*  39: 74 */       aqc localaqc = (aqc)get(i);
/*  40: 75 */       paramhd.a(localaqc.a());
/*  41: 76 */       paramhd.a(localaqc.d());
/*  42:    */       
/*  43: 78 */       amj localamj = localaqc.b();
/*  44: 79 */       paramhd.writeBoolean(localamj != null);
/*  45: 80 */       if (localamj != null) {
/*  46: 81 */         paramhd.a(localamj);
/*  47:    */       }
/*  48: 83 */       paramhd.writeBoolean(localaqc.h());
/*  49: 84 */       paramhd.writeInt(localaqc.e());
/*  50: 85 */       paramhd.writeInt(localaqc.f());
/*  51:    */     }
/*  52:    */   }
/*  53:    */   
/*  54:    */   public static aqd b(hd paramhd)
/*  55:    */   {
/*  56: 90 */     aqd localaqd = new aqd();
/*  57:    */     
/*  58: 92 */     int i = paramhd.readByte() & 0xFF;
/*  59: 93 */     for (int j = 0; j < i; j++)
/*  60:    */     {
/*  61: 94 */       amj localamj1 = paramhd.i();
/*  62: 95 */       amj localamj2 = paramhd.i();
/*  63:    */       
/*  64: 97 */       amj localamj3 = null;
/*  65: 98 */       if (paramhd.readBoolean()) {
/*  66: 99 */         localamj3 = paramhd.i();
/*  67:    */       }
/*  68:101 */       boolean bool = paramhd.readBoolean();
/*  69:102 */       int k = paramhd.readInt();
/*  70:103 */       int m = paramhd.readInt();
/*  71:    */       
/*  72:105 */       aqc localaqc = new aqc(localamj1, localamj3, localamj2, k, m);
/*  73:106 */       if (bool) {
/*  74:107 */         localaqc.i();
/*  75:    */       }
/*  76:109 */       localaqd.add(localaqc);
/*  77:    */     }
/*  78:111 */     return localaqd;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void a(fn paramfn)
/*  82:    */   {
/*  83:115 */     fv localfv = paramfn.c("Recipes", 10);
/*  84:117 */     for (int i = 0; i < localfv.c(); i++)
/*  85:    */     {
/*  86:118 */       fn localfn = localfv.b(i);
/*  87:119 */       add(new aqc(localfn));
/*  88:    */     }
/*  89:    */   }
/*  90:    */   
/*  91:    */   public fn a()
/*  92:    */   {
/*  93:124 */     fn localfn = new fn();
/*  94:    */     
/*  95:126 */     fv localfv = new fv();
/*  96:127 */     for (int i = 0; i < size(); i++)
/*  97:    */     {
/*  98:128 */       aqc localaqc = (aqc)get(i);
/*  99:129 */       localfv.a(localaqc.k());
/* 100:    */     }
/* 101:131 */     localfn.a("Recipes", localfv);
/* 102:132 */     return localfn;
/* 103:    */   }
/* 104:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aqd
 * JD-Core Version:    0.7.0.1
 */