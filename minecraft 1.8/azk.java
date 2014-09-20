/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class azk
/*   4:    */   extends avb
/*   5:    */ {
/*   6:    */   private bek a;
/*   7:    */   private bek b;
/*   8:    */   private bek M;
/*   9:    */   private bek O;
/*  10:    */   
/*  11:    */   protected azk()
/*  12:    */   {
/*  13: 26 */     super(bof.C);
/*  14: 27 */     j(this.L.b().a(N, ej.c));
/*  15: 28 */     a(true);
/*  16: 29 */     a(akf.b);
/*  17:    */   }
/*  18:    */   
/*  19:    */   public void c(aqu paramaqu, dt paramdt, bec parambec)
/*  20:    */   {
/*  21: 34 */     super.c(paramaqu, paramdt, parambec);
/*  22: 35 */     e(paramaqu, paramdt);
/*  23:    */   }
/*  24:    */   
/*  25:    */   public boolean d(aqu paramaqu, dt paramdt)
/*  26:    */   {
/*  27: 39 */     return (j().a(paramaqu, paramdt) != null) || (S().a(paramaqu, paramdt) != null);
/*  28:    */   }
/*  29:    */   
/*  30:    */   private void e(aqu paramaqu, dt paramdt)
/*  31:    */   {
/*  32:    */     bem localbem;
/*  33:    */     int m;
/*  34: 45 */     if ((localbem = l().a(paramaqu, paramdt)) != null)
/*  35:    */     {
/*  36: 46 */       for (int i = 0; i < l().b(); i++)
/*  37:    */       {
/*  38: 47 */         localObject = localbem.a(0, i, 0);
/*  39: 48 */         paramaqu.a(((bei)localObject).d(), aty.a.P(), 2);
/*  40:    */       }
/*  41: 51 */       acn localacn = new acn(paramaqu);
/*  42: 52 */       Object localObject = localbem.a(0, 2, 0).d();
/*  43: 53 */       localacn.b(((dt)localObject).n() + 0.5D, ((dt)localObject).o() + 0.05D, ((dt)localObject).p() + 0.5D, 0.0F, 0.0F);
/*  44: 54 */       paramaqu.d(localacn);
/*  45: 56 */       for (m = 0; m < 120; m++) {
/*  46: 57 */         paramaqu.a(ew.G, ((dt)localObject).n() + paramaqu.s.nextDouble(), ((dt)localObject).o() + paramaqu.s.nextDouble() * 2.5D, ((dt)localObject).p() + paramaqu.s.nextDouble(), 0.0D, 0.0D, 0.0D, new int[0]);
/*  47:    */       }
/*  48: 60 */       for (m = 0; m < l().b(); m++)
/*  49:    */       {
/*  50: 61 */         bei localbei1 = localbem.a(0, m, 0);
/*  51: 62 */         paramaqu.b(localbei1.d(), aty.a);
/*  52:    */       }
/*  53:    */     }
/*  54: 64 */     else if ((localbem = T().a(paramaqu, paramdt)) != null)
/*  55:    */     {
/*  56: 65 */       for (int j = 0; j < T().c(); j++) {
/*  57: 66 */         for (int k = 0; k < T().b(); k++) {
/*  58: 67 */           paramaqu.a(localbem.a(j, k, 0).d(), aty.a.P(), 2);
/*  59:    */         }
/*  60:    */       }
/*  61: 71 */       dt localdt = localbem.a(1, 2, 0).d();
/*  62:    */       
/*  63: 73 */       acq localacq = new acq(paramaqu);
/*  64: 74 */       localacq.l(true);
/*  65: 75 */       localacq.b(localdt.n() + 0.5D, localdt.o() + 0.05D, localdt.p() + 0.5D, 0.0F, 0.0F);
/*  66: 76 */       paramaqu.d(localacq);
/*  67: 78 */       for (m = 0; m < 120; m++) {
/*  68: 79 */         paramaqu.a(ew.F, localdt.n() + paramaqu.s.nextDouble(), localdt.o() + paramaqu.s.nextDouble() * 3.9D, localdt.p() + paramaqu.s.nextDouble(), 0.0D, 0.0D, 0.0D, new int[0]);
/*  69:    */       }
/*  70: 82 */       for (m = 0; m < T().c(); m++) {
/*  71: 83 */         for (int n = 0; n < T().b(); n++)
/*  72:    */         {
/*  73: 84 */           bei localbei2 = localbem.a(m, n, 0);
/*  74: 85 */           paramaqu.b(localbei2.d(), aty.a);
/*  75:    */         }
/*  76:    */       }
/*  77:    */     }
/*  78:    */   }
/*  79:    */   
/*  80:    */   public boolean c(aqu paramaqu, dt paramdt)
/*  81:    */   {
/*  82: 93 */     return (paramaqu.p(paramdt).c().J.j()) && (aqu.a(paramaqu, paramdt.b()));
/*  83:    */   }
/*  84:    */   
/*  85:    */   public bec a(aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, xm paramxm)
/*  86:    */   {
/*  87: 98 */     return P().a(N, paramxm.aO().d());
/*  88:    */   }
/*  89:    */   
/*  90:    */   public bec a(int paramInt)
/*  91:    */   {
/*  92:103 */     return P().a(N, ej.b(paramInt));
/*  93:    */   }
/*  94:    */   
/*  95:    */   public int c(bec parambec)
/*  96:    */   {
/*  97:109 */     return ((ej)parambec.b(N)).b();
/*  98:    */   }
/*  99:    */   
/* 100:    */   protected bed e()
/* 101:    */   {
/* 102:114 */     return new bed(this, new bex[] { N });
/* 103:    */   }
/* 104:    */   
/* 105:    */   protected bek j()
/* 106:    */   {
/* 107:118 */     if (this.a == null) {
/* 108:119 */       this.a = ben.a().a(new String[] { " ", "#", "#" }).a('#', bei.a(beq.a(aty.aJ))).b();
/* 109:    */     }
/* 110:129 */     return this.a;
/* 111:    */   }
/* 112:    */   
/* 113:    */   protected bek l()
/* 114:    */   {
/* 115:133 */     if (this.b == null) {
/* 116:134 */       this.b = ben.a().a(new String[] { "^", "#", "#" }).a('^', bei.a(beq.a(aty.aU))).a('#', bei.a(beq.a(aty.aJ))).b();
/* 117:    */     }
/* 118:145 */     return this.b;
/* 119:    */   }
/* 120:    */   
/* 121:    */   protected bek S()
/* 122:    */   {
/* 123:149 */     if (this.M == null) {
/* 124:150 */       this.M = ben.a().a(new String[] { "~ ~", "###", "~#~" }).a('#', bei.a(beq.a(aty.S))).a('~', bei.a(beq.a(aty.a))).b();
/* 125:    */     }
/* 126:161 */     return this.M;
/* 127:    */   }
/* 128:    */   
/* 129:    */   protected bek T()
/* 130:    */   {
/* 131:165 */     if (this.O == null) {
/* 132:166 */       this.O = ben.a().a(new String[] { "~^~", "###", "~#~" }).a('^', bei.a(beq.a(aty.aU))).a('#', bei.a(beq.a(aty.S))).a('~', bei.a(beq.a(aty.a))).b();
/* 133:    */     }
/* 134:178 */     return this.O;
/* 135:    */   }
/* 136:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     azk
 * JD-Core Version:    0.7.0.1
 */