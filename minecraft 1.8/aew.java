/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class aew
/*   4:    */   extends afm
/*   5:    */ {
/*   6: 19 */   private int b = 0;
/*   7: 20 */   private boolean c = false;
/*   8:    */   
/*   9:    */   public aew(aqu paramaqu)
/*  10:    */   {
/*  11: 23 */     super(paramaqu);
/*  12: 24 */     this.b_ = 3;
/*  13:    */     
/*  14: 26 */     a(0.4F, 0.3F);
/*  15:    */     
/*  16: 28 */     this.i.a(1, new yy(this));
/*  17: 29 */     this.i.a(2, new zk(this, ahd.class, 1.0D, false));
/*  18: 30 */     this.i.a(3, new zy(this, 1.0D));
/*  19: 31 */     this.i.a(7, new zh(this, ahd.class, 8.0F));
/*  20: 32 */     this.i.a(8, new zx(this));
/*  21:    */     
/*  22: 34 */     this.bg.a(1, new aal(this, true, new Class[0]));
/*  23: 35 */     this.bg.a(2, new aaq(this, ahd.class, true));
/*  24:    */   }
/*  25:    */   
/*  26:    */   public float aR()
/*  27:    */   {
/*  28: 40 */     return 0.1F;
/*  29:    */   }
/*  30:    */   
/*  31:    */   protected void aW()
/*  32:    */   {
/*  33: 45 */     super.aW();
/*  34:    */     
/*  35: 47 */     a(afs.a).a(8.0D);
/*  36: 48 */     a(afs.d).a(0.25D);
/*  37: 49 */     a(afs.e).a(2.0D);
/*  38:    */   }
/*  39:    */   
/*  40:    */   protected boolean r_()
/*  41:    */   {
/*  42: 54 */     return false;
/*  43:    */   }
/*  44:    */   
/*  45:    */   protected String z()
/*  46:    */   {
/*  47: 59 */     return "mob.silverfish.say";
/*  48:    */   }
/*  49:    */   
/*  50:    */   protected String bn()
/*  51:    */   {
/*  52: 64 */     return "mob.silverfish.hit";
/*  53:    */   }
/*  54:    */   
/*  55:    */   protected String bo()
/*  56:    */   {
/*  57: 69 */     return "mob.silverfish.kill";
/*  58:    */   }
/*  59:    */   
/*  60:    */   protected void a(dt paramdt, atr paramatr)
/*  61:    */   {
/*  62: 74 */     a("mob.silverfish.step", 0.15F, 1.0F);
/*  63:    */   }
/*  64:    */   
/*  65:    */   protected alq A()
/*  66:    */   {
/*  67: 79 */     return null;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void a(fn paramfn)
/*  71:    */   {
/*  72: 84 */     super.a(paramfn);
/*  73: 85 */     this.b = paramfn.f("Lifetime");
/*  74: 86 */     this.c = paramfn.n("PlayerSpawned");
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void b(fn paramfn)
/*  78:    */   {
/*  79: 91 */     super.b(paramfn);
/*  80: 92 */     paramfn.a("Lifetime", this.b);
/*  81: 93 */     paramfn.a("PlayerSpawned", this.c);
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void s_()
/*  85:    */   {
/*  86: 99 */     this.aG = this.y;
/*  87:    */     
/*  88:101 */     super.s_();
/*  89:    */   }
/*  90:    */   
/*  91:    */   public boolean n()
/*  92:    */   {
/*  93:105 */     return this.c;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void a(boolean paramBoolean)
/*  97:    */   {
/*  98:109 */     this.c = paramBoolean;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void m()
/* 102:    */   {
/* 103:114 */     super.m();
/* 104:116 */     if (this.o.D)
/* 105:    */     {
/* 106:117 */       for (int i = 0; i < 2; i++) {
/* 107:118 */         this.o.a(ew.y, this.s + (this.V.nextDouble() - 0.5D) * this.J, this.t + this.V.nextDouble() * this.K, this.u + (this.V.nextDouble() - 0.5D) * this.J, (this.V.nextDouble() - 0.5D) * 2.0D, -this.V.nextDouble(), (this.V.nextDouble() - 0.5D) * 2.0D, new int[0]);
/* 108:    */       }
/* 109:    */     }
/* 110:    */     else
/* 111:    */     {
/* 112:121 */       if (!bY()) {
/* 113:122 */         this.b += 1;
/* 114:    */       }
/* 115:125 */       if (this.b >= 2400) {
/* 116:126 */         J();
/* 117:    */       }
/* 118:    */     }
/* 119:    */   }
/* 120:    */   
/* 121:    */   protected boolean m_()
/* 122:    */   {
/* 123:133 */     return true;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public boolean bQ()
/* 127:    */   {
/* 128:138 */     if (super.bQ())
/* 129:    */     {
/* 130:139 */       ahd localahd = this.o.a(this, 5.0D);
/* 131:140 */       return localahd == null;
/* 132:    */     }
/* 133:142 */     return false;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public xs by()
/* 137:    */   {
/* 138:147 */     return xs.c;
/* 139:    */   }
/* 140:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aew
 * JD-Core Version:    0.7.0.1
 */